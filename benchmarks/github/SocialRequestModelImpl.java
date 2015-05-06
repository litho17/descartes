/* ./liferay-liferay-portal-b66e4b4/portal-impl/src/com/liferay/portlet/social/model/impl/SocialRequestModelImpl.java */
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

package com.liferay.portlet.social.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.User;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.social.model.SocialRequest;
import com.liferay.portlet.social.model.SocialRequestModel;
import com.liferay.portlet.social.model.SocialRequestSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SocialRequest service. Represents a row in the &quot;SocialRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SocialRequestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SocialRequestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SocialRequestImpl
 * @see SocialRequest
 * @see SocialRequestModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class SocialRequestModelImpl extends BaseModelImpl<SocialRequest>
	implements SocialRequestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a social request model instance should use the {@link SocialRequest} interface instead.
	 */
	public static final String TABLE_NAME = "SocialRequest";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "requestId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.BIGINT },
			{ "modifiedDate", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "type_", Types.INTEGER },
			{ "extraData", Types.VARCHAR },
			{ "receiverUserId", Types.BIGINT },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table SocialRequest (uuid_ VARCHAR(75) null,requestId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createDate LONG,modifiedDate LONG,classNameId LONG,classPK LONG,type_ INTEGER,extraData STRING null,receiverUserId LONG,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table SocialRequest";
	public static final String ORDER_BY_JPQL = " ORDER BY socialRequest.requestId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY SocialRequest.requestId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.social.model.SocialRequest"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.social.model.SocialRequest"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portlet.social.model.SocialRequest"),
			true);
	public static final long CLASSNAMEID_COLUMN_BITMASK = 1L;
	public static final long CLASSPK_COLUMN_BITMASK = 2L;
	public static final long COMPANYID_COLUMN_BITMASK = 4L;
	public static final long GROUPID_COLUMN_BITMASK = 8L;
	public static final long RECEIVERUSERID_COLUMN_BITMASK = 16L;
	public static final long STATUS_COLUMN_BITMASK = 32L;
	public static final long TYPE_COLUMN_BITMASK = 64L;
	public static final long USERID_COLUMN_BITMASK = 128L;
	public static final long UUID_COLUMN_BITMASK = 256L;
	public static final long REQUESTID_COLUMN_BITMASK = 512L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SocialRequest toModel(SocialRequestSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SocialRequest model = new SocialRequestImpl();

		model.setUuid(soapModel.getUuid());
		model.setRequestId(soapModel.getRequestId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setClassNameId(soapModel.getClassNameId());
		model.setClassPK(soapModel.getClassPK());
		model.setType(soapModel.getType());
		model.setExtraData(soapModel.getExtraData());
		model.setReceiverUserId(soapModel.getReceiverUserId());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SocialRequest> toModels(SocialRequestSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SocialRequest> models = new ArrayList<SocialRequest>(soapModels.length);

		for (SocialRequestSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.social.model.SocialRequest"));

	public SocialRequestModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _requestId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SocialRequest.class;
	}

	@Override
	public String getModelClassName() {
		return SocialRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("requestId", getRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("type", getType());
		attributes.put("extraData", getExtraData());
		attributes.put("receiverUserId", getReceiverUserId());
		attributes.put("status", getStatus());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long requestId = (Long)attributes.get("requestId");

		if (requestId != null) {
			setRequestId(requestId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long createDate = (Long)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Long modifiedDate = (Long)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String extraData = (String)attributes.get("extraData");

		if (extraData != null) {
			setExtraData(extraData);
		}

		Long receiverUserId = (Long)attributes.get("receiverUserId");

		if (receiverUserId != null) {
			setReceiverUserId(receiverUserId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getRequestId() {
		return _requestId;
	}

	@Override
	public void setRequestId(long requestId) {
		_columnBitmask = -1L;

		_requestId = requestId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public long getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(long createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public long getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(long modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	@Override
	public void setClassName(String className) {
		long classNameId = 0;

		if (Validator.isNotNull(className)) {
			classNameId = PortalUtil.getClassNameId(className);
		}

		setClassNameId(classNameId);
	}

	@JSON
	@Override
	public long getClassNameId() {
		return _classNameId;
	}

	@Override
	public void setClassNameId(long classNameId) {
		_columnBitmask |= CLASSNAMEID_COLUMN_BITMASK;

		if (!_setOriginalClassNameId) {
			_setOriginalClassNameId = true;

			_originalClassNameId = _classNameId;
		}

		_classNameId = classNameId;
	}

	public long getOriginalClassNameId() {
		return _originalClassNameId;
	}

	@JSON
	@Override
	public long getClassPK() {
		return _classPK;
	}

	@Override
	public void setClassPK(long classPK) {
		_columnBitmask |= CLASSPK_COLUMN_BITMASK;

		if (!_setOriginalClassPK) {
			_setOriginalClassPK = true;

			_originalClassPK = _classPK;
		}

		_classPK = classPK;
	}

	public long getOriginalClassPK() {
		return _originalClassPK;
	}

	@JSON
	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (!_setOriginalType) {
			_setOriginalType = true;

			_originalType = _type;
		}

		_type = type;
	}

	public int getOriginalType() {
		return _originalType;
	}

	@JSON
	@Override
	public String getExtraData() {
		if (_extraData == null) {
			return StringPool.BLANK;
		}
		else {
			return _extraData;
		}
	}

	@Override
	public void setExtraData(String extraData) {
		_extraData = extraData;
	}

	@JSON
	@Override
	public long getReceiverUserId() {
		return _receiverUserId;
	}

	@Override
	public void setReceiverUserId(long receiverUserId) {
		_columnBitmask |= RECEIVERUSERID_COLUMN_BITMASK;

		if (!_setOriginalReceiverUserId) {
			_setOriginalReceiverUserId = true;

			_originalReceiverUserId = _receiverUserId;
		}

		_receiverUserId = receiverUserId;
	}

	@Override
	public String getReceiverUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getReceiverUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setReceiverUserUuid(String receiverUserUuid) {
	}

	public long getOriginalReceiverUserId() {
		return _originalReceiverUserId;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SocialRequest.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SocialRequest toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SocialRequest)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SocialRequestImpl socialRequestImpl = new SocialRequestImpl();

		socialRequestImpl.setUuid(getUuid());
		socialRequestImpl.setRequestId(getRequestId());
		socialRequestImpl.setGroupId(getGroupId());
		socialRequestImpl.setCompanyId(getCompanyId());
		socialRequestImpl.setUserId(getUserId());
		socialRequestImpl.setCreateDate(getCreateDate());
		socialRequestImpl.setModifiedDate(getModifiedDate());
		socialRequestImpl.setClassNameId(getClassNameId());
		socialRequestImpl.setClassPK(getClassPK());
		socialRequestImpl.setType(getType());
		socialRequestImpl.setExtraData(getExtraData());
		socialRequestImpl.setReceiverUserId(getReceiverUserId());
		socialRequestImpl.setStatus(getStatus());

		socialRequestImpl.resetOriginalValues();

		return socialRequestImpl;
	}

	@Override
	public int compareTo(SocialRequest socialRequest) {
		int value = 0;

		if (getRequestId() < socialRequest.getRequestId()) {
			value = -1;
		}
		else if (getRequestId() > socialRequest.getRequestId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SocialRequest)) {
			return false;
		}

		SocialRequest socialRequest = (SocialRequest)obj;

		long primaryKey = socialRequest.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		SocialRequestModelImpl socialRequestModelImpl = this;

		socialRequestModelImpl._originalUuid = socialRequestModelImpl._uuid;

		socialRequestModelImpl._originalGroupId = socialRequestModelImpl._groupId;

		socialRequestModelImpl._setOriginalGroupId = false;

		socialRequestModelImpl._originalCompanyId = socialRequestModelImpl._companyId;

		socialRequestModelImpl._setOriginalCompanyId = false;

		socialRequestModelImpl._originalUserId = socialRequestModelImpl._userId;

		socialRequestModelImpl._setOriginalUserId = false;

		socialRequestModelImpl._originalClassNameId = socialRequestModelImpl._classNameId;

		socialRequestModelImpl._setOriginalClassNameId = false;

		socialRequestModelImpl._originalClassPK = socialRequestModelImpl._classPK;

		socialRequestModelImpl._setOriginalClassPK = false;

		socialRequestModelImpl._originalType = socialRequestModelImpl._type;

		socialRequestModelImpl._setOriginalType = false;

		socialRequestModelImpl._originalReceiverUserId = socialRequestModelImpl._receiverUserId;

		socialRequestModelImpl._setOriginalReceiverUserId = false;

		socialRequestModelImpl._originalStatus = socialRequestModelImpl._status;

		socialRequestModelImpl._setOriginalStatus = false;

		socialRequestModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SocialRequest> toCacheModel() {
		SocialRequestCacheModel socialRequestCacheModel = new SocialRequestCacheModel();

		socialRequestCacheModel.uuid = getUuid();

		String uuid = socialRequestCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			socialRequestCacheModel.uuid = null;
		}

		socialRequestCacheModel.requestId = getRequestId();

		socialRequestCacheModel.groupId = getGroupId();

		socialRequestCacheModel.companyId = getCompanyId();

		socialRequestCacheModel.userId = getUserId();

		socialRequestCacheModel.createDate = getCreateDate();

		socialRequestCacheModel.modifiedDate = getModifiedDate();

		socialRequestCacheModel.classNameId = getClassNameId();

		socialRequestCacheModel.classPK = getClassPK();

		socialRequestCacheModel.type = getType();

		socialRequestCacheModel.extraData = getExtraData();

		String extraData = socialRequestCacheModel.extraData;

		if ((extraData != null) && (extraData.length() == 0)) {
			socialRequestCacheModel.extraData = null;
		}

		socialRequestCacheModel.receiverUserId = getReceiverUserId();

		socialRequestCacheModel.status = getStatus();

		return socialRequestCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", requestId=");
		sb.append(getRequestId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", extraData=");
		sb.append(getExtraData());
		sb.append(", receiverUserId=");
		sb.append(getReceiverUserId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.social.model.SocialRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestId</column-name><column-value><![CDATA[");
		sb.append(getRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extraData</column-name><column-value><![CDATA[");
		sb.append(getExtraData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverUserId</column-name><column-value><![CDATA[");
		sb.append(getReceiverUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = SocialRequest.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			SocialRequest.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _requestId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _createDate;
	private long _modifiedDate;
	private long _classNameId;
	private long _originalClassNameId;
	private boolean _setOriginalClassNameId;
	private long _classPK;
	private long _originalClassPK;
	private boolean _setOriginalClassPK;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private String _extraData;
	private long _receiverUserId;
	private long _originalReceiverUserId;
	private boolean _setOriginalReceiverUserId;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private SocialRequest _escapedModel;
}