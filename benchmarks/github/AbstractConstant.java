/* ./netty-netty-410aa42/common/src/main/java/io/netty/util/AbstractConstant.java */
/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.ThreadLocalRandom;

import java.nio.ByteBuffer;

/**
 * Base implementation of {@link Constant}.
 */
public abstract class AbstractConstant<T extends AbstractConstant<T>> implements Constant<T> {

    private final int id;
    private final String name;
    private volatile long uniquifier;
    private ByteBuffer directBuffer;

    /**
     * Creates a new instance.
     */
    protected AbstractConstant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public final String name() {
        return name;
    }

    @Override
    public final int id() {
        return id;
    }

    @Override
    public final String toString() {
        return name();
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public final int compareTo(T o) {
        if (this == o) {
            return 0;
        }

        @SuppressWarnings("UnnecessaryLocalVariable")
        AbstractConstant<T> other = o;
        int returnCode;

        returnCode = hashCode() - other.hashCode();
        if (returnCode != 0) {
            return returnCode;
        }

        long thisUV = uniquifier();
        long otherUV = other.uniquifier();
        if (thisUV < otherUV) {
            return -1;
        }
        if (thisUV > otherUV) {
            return 1;
        }

        throw new Error("failed to compare two different constants");
    }

    private long uniquifier() {
        long uniquifier;
        if ((uniquifier = this.uniquifier) == 0) {
            synchronized (this) {
                while ((uniquifier = this.uniquifier) == 0) {
                    if (PlatformDependent.hasUnsafe()) {
                        directBuffer = ByteBuffer.allocateDirect(1);
                        this.uniquifier = PlatformDependent.directBufferAddress(directBuffer);
                    } else {
                        directBuffer = null;
                        this.uniquifier = ThreadLocalRandom.current().nextLong();
                    }
                }
            }
        }

        return uniquifier;
    }
}