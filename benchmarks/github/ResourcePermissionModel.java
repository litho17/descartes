/* ./liferay-liferay-portal-b66e4b4/portal-service/src/com/liferay/portal/model/ResourcePermissionModel.java */
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ResourcePermission service. Represents a row in the &quot;ResourcePermission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ResourcePermissionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ResourcePermissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourcePermission
 * @see com.liferay.portal.model.impl.ResourcePermissionImpl
 * @see com.liferay.portal.model.impl.ResourcePermissionModelImpl
 * @generated
 */
@ProviderType
public interface ResourcePermissionModel extends BaseModel<ResourcePermission>,
	MVCCModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a resource permission model instance should use the {@link ResourcePermission} interface instead.
	 */

	/**
	 * Returns the primary key of this resource permission.
	 *
	 * @return the primary key of this resource permission
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this resource permission.
	 *
	 * @param primaryKey the primary key of this resource permission
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this resource permission.
	 *
	 * @return the mvcc version of this resource permission
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this resource permission.
	 *
	 * @param mvccVersion the mvcc version of this resource permission
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the resource permission ID of this resource permission.
	 *
	 * @return the resource permission ID of this resource permission
	 */
	public long getResourcePermissionId();

	/**
	 * Sets the resource permission ID of this resource permission.
	 *
	 * @param resourcePermissionId the resource permission ID of this resource permission
	 */
	public void setResourcePermissionId(long resourcePermissionId);

	/**
	 * Returns the company ID of this resource permission.
	 *
	 * @return the company ID of this resource permission
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this resource permission.
	 *
	 * @param companyId the company ID of this resource permission
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the name of this resource permission.
	 *
	 * @return the name of this resource permission
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this resource permission.
	 *
	 * @param name the name of this resource permission
	 */
	public void setName(String name);

	/**
	 * Returns the scope of this resource permission.
	 *
	 * @return the scope of this resource permission
	 */
	public int getScope();

	/**
	 * Sets the scope of this resource permission.
	 *
	 * @param scope the scope of this resource permission
	 */
	public void setScope(int scope);

	/**
	 * Returns the prim key of this resource permission.
	 *
	 * @return the prim key of this resource permission
	 */
	@AutoEscape
	public String getPrimKey();

	/**
	 * Sets the prim key of this resource permission.
	 *
	 * @param primKey the prim key of this resource permission
	 */
	public void setPrimKey(String primKey);

	/**
	 * Returns the role ID of this resource permission.
	 *
	 * @return the role ID of this resource permission
	 */
	public long getRoleId();

	/**
	 * Sets the role ID of this resource permission.
	 *
	 * @param roleId the role ID of this resource permission
	 */
	public void setRoleId(long roleId);

	/**
	 * Returns the owner ID of this resource permission.
	 *
	 * @return the owner ID of this resource permission
	 */
	public long getOwnerId();

	/**
	 * Sets the owner ID of this resource permission.
	 *
	 * @param ownerId the owner ID of this resource permission
	 */
	public void setOwnerId(long ownerId);

	/**
	 * Returns the action IDs of this resource permission.
	 *
	 * @return the action IDs of this resource permission
	 */
	public long getActionIds();

	/**
	 * Sets the action IDs of this resource permission.
	 *
	 * @param actionIds the action IDs of this resource permission
	 */
	public void setActionIds(long actionIds);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.portal.model.ResourcePermission resourcePermission);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.model.ResourcePermission> toCacheModel();

	@Override
	public com.liferay.portal.model.ResourcePermission toEscapedModel();

	@Override
	public com.liferay.portal.model.ResourcePermission toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}