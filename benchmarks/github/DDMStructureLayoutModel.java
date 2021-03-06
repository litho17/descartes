/* ./liferay-liferay-portal-b66e4b4/portal-service/src/com/liferay/portlet/dynamicdatamapping/model/DDMStructureLayoutModel.java */
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

package com.liferay.portlet.dynamicdatamapping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DDMStructureLayout service. Represents a row in the &quot;DDMStructureLayout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLayoutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLayoutImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureLayout
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLayoutImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLayoutModelImpl
 * @generated
 */
@ProviderType
public interface DDMStructureLayoutModel extends BaseModel<DDMStructureLayout>,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a d d m structure layout model instance should use the {@link DDMStructureLayout} interface instead.
	 */

	/**
	 * Returns the primary key of this d d m structure layout.
	 *
	 * @return the primary key of this d d m structure layout
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this d d m structure layout.
	 *
	 * @param primaryKey the primary key of this d d m structure layout
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this d d m structure layout.
	 *
	 * @return the uuid of this d d m structure layout
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this d d m structure layout.
	 *
	 * @param uuid the uuid of this d d m structure layout
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the structure layout ID of this d d m structure layout.
	 *
	 * @return the structure layout ID of this d d m structure layout
	 */
	public long getStructureLayoutId();

	/**
	 * Sets the structure layout ID of this d d m structure layout.
	 *
	 * @param structureLayoutId the structure layout ID of this d d m structure layout
	 */
	public void setStructureLayoutId(long structureLayoutId);

	/**
	 * Returns the group ID of this d d m structure layout.
	 *
	 * @return the group ID of this d d m structure layout
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this d d m structure layout.
	 *
	 * @param groupId the group ID of this d d m structure layout
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this d d m structure layout.
	 *
	 * @return the company ID of this d d m structure layout
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this d d m structure layout.
	 *
	 * @param companyId the company ID of this d d m structure layout
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this d d m structure layout.
	 *
	 * @return the user ID of this d d m structure layout
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this d d m structure layout.
	 *
	 * @param userId the user ID of this d d m structure layout
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this d d m structure layout.
	 *
	 * @return the user uuid of this d d m structure layout
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this d d m structure layout.
	 *
	 * @param userUuid the user uuid of this d d m structure layout
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this d d m structure layout.
	 *
	 * @return the user name of this d d m structure layout
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this d d m structure layout.
	 *
	 * @param userName the user name of this d d m structure layout
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this d d m structure layout.
	 *
	 * @return the create date of this d d m structure layout
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this d d m structure layout.
	 *
	 * @param createDate the create date of this d d m structure layout
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this d d m structure layout.
	 *
	 * @return the modified date of this d d m structure layout
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this d d m structure layout.
	 *
	 * @param modifiedDate the modified date of this d d m structure layout
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the structure version ID of this d d m structure layout.
	 *
	 * @return the structure version ID of this d d m structure layout
	 */
	public long getStructureVersionId();

	/**
	 * Sets the structure version ID of this d d m structure layout.
	 *
	 * @param structureVersionId the structure version ID of this d d m structure layout
	 */
	public void setStructureVersionId(long structureVersionId);

	/**
	 * Returns the definition of this d d m structure layout.
	 *
	 * @return the definition of this d d m structure layout
	 */
	@AutoEscape
	public String getDefinition();

	/**
	 * Sets the definition of this d d m structure layout.
	 *
	 * @param definition the definition of this d d m structure layout
	 */
	public void setDefinition(String definition);

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
		com.liferay.portlet.dynamicdatamapping.model.DDMStructureLayout ddmStructureLayout);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portlet.dynamicdatamapping.model.DDMStructureLayout> toCacheModel();

	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureLayout toEscapedModel();

	@Override
	public com.liferay.portlet.dynamicdatamapping.model.DDMStructureLayout toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}