/*  * org.eclipse.cdt-CDT_8_5_0/dsf-gdb/org.eclipse.cdt.dsf.gdb.multicorevisualizer.ui/src/org/eclipse/cdt/dsf/gdb/multicorevisualizer/internal/ui/model/VisualizerCPU.java */
/*******************************************************************************
 * Copyright (c) 2012, 2013 Tilera Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     William R. Swanson (Tilera Corporation) - initial API and implementation
 *     Marc Dumais (Ericsson) - Add CPU/core load information to the multicore visualizer (Bug 396268)
 *     Marc Dumais (Ericsson) -  Bug 405390
 *******************************************************************************/

package org.eclipse.cdt.dsf.gdb.multicorevisualizer.internal.ui.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

//----------------------------------------------------------------------------
// VisualizerCPU
//----------------------------------------------------------------------------

/** Represents single CPU. */
public class VisualizerCPU
	implements Comparable<VisualizerCPU>, IVisualizerModelObject
{
	// --- members ---
	
	/** ID of this core. */
	public int m_id;
	
	/** Contains load information
	 * @since 1.1
	 */
	protected VisualizerLoadInfo m_loadinfo;
	
	/** List of cores */
	protected ArrayList<VisualizerCore> m_cores;
	
	/** Lookup table for cores. */
	protected Hashtable<Integer, VisualizerCore> m_coreMap;
	
	
	// --- constructors/destructors ---
	
	/** Constructor */
	public VisualizerCPU(int id) {
		m_id = id;
		m_cores = new ArrayList<VisualizerCore>();
		m_coreMap = new Hashtable<Integer, VisualizerCore>();
	}
	
	/** Dispose method */
	public void dispose() {
		if (m_cores != null) {
			for (VisualizerCore core : m_cores) {
				core.dispose();
			}
			m_coreMap.clear();
			m_coreMap = null;
			m_cores.clear();
			m_cores = null;
			m_loadinfo = null;
		}
	}
	
	
	// --- Object methods ---
	
	/** Returns string representation. */
	@Override
	public String toString() {
		return "CPU:" + m_id; //$NON-NLS-1$
	}
	
	
	// --- accessors ---
	
	/** Gets ID of this CPU. */
	@Override
	public int getID() {
		return m_id;
	}
	
	/** CPU has no parent  - always returns null */
	@Override
	public IVisualizerModelObject getParent() {
		return null;
	}
	
	/** sets the load info for this CPU 
	 * @since 1.1*/
	public synchronized void setLoadInfo (VisualizerLoadInfo info) {
		m_loadinfo = info;
	}
	
	/** Gets the CPU usage load of this CPU. 
	 * @since 1.1*/
	public synchronized Integer getLoad() {
		return (m_loadinfo == null) ? null : m_loadinfo.getLoad();
	}
	
	/** get the highest recorded load for this CPU
	 * @since 1.1*/
	public synchronized Integer getHighLoadWatermark() {
		return (m_loadinfo == null) ? null : m_loadinfo.getHighLoadWaterMark();
	}
	
	// --- methods ---
	
	/** Gets number of cores. */
	public int getCoreCount() {
		return m_cores.size();
	}
	
	/** Gets cores. */
	public List<VisualizerCore> getCores() {
		return m_cores;
	}
	
	/** Gets core with specified ID. */
	public VisualizerCore getCore(int id) {
		return m_coreMap.get(id);
	}
	
	/** Adds core. */
	public VisualizerCore addCore(VisualizerCore core) {
		m_cores.add(core);
		m_coreMap.put(core.getID(), core);
		return core;
	}

	/** Removes core. */
	public void removeCore(VisualizerCore core) {
		m_cores.remove(core);
		m_coreMap.remove(core.getID());
	}

	
	/** Sorts cores, cpus, etc. by IDs. */
	public void sort() {
		Collections.sort(m_cores);
	}

	
	// --- Comparable implementation ---
	
	/** Compares this item to the specified item. */
	@Override
	public int compareTo(VisualizerCPU o) {
		int result = 0;
		if (o != null) {
			if (m_id < o.m_id) {
				result = -1;
			}
			else if (m_id > o.m_id) {
				result = 1;
			}
		}
		return result;
	}
	
	/** IVisualizerModelObject version of compareTO() */
	@Override
	public int compareTo(IVisualizerModelObject o) {
		if (o != null) {
			if (o.getClass() == this.getClass()) {
				return compareTo((VisualizerCPU)o);
			}
		}
		return 1;
	}
}
