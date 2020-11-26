package org.wso2.carbon.apimgt.rest.api.service.catalog;

import org.wso2.carbon.apimgt.rest.api.service.catalog.*;
import org.wso2.carbon.apimgt.rest.api.service.catalog.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.apimgt.api.APIManagementException;

import org.wso2.carbon.apimgt.rest.api.service.catalog.dto.ErrorDTO;
import java.io.File;
import org.wso2.carbon.apimgt.rest.api.service.catalog.dto.ServiceDTO;
import org.wso2.carbon.apimgt.rest.api.service.catalog.dto.ServiceListDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface ServicesApiService {
      public Response checkServiceExistence(String name, String version, MessageContext messageContext) throws APIManagementException;
      public Response createService(ServiceDTO catalogEntry, InputStream definitionFileInputStream, Attachment definitionFileDetail, MessageContext messageContext) throws APIManagementException;
      public Response deleteService(String serviceId, MessageContext messageContext) throws APIManagementException;
      public Response exportService(String name, String version, MessageContext messageContext) throws APIManagementException;
      public Response getServiceById(String serviceId, MessageContext messageContext) throws APIManagementException;
      public Response getServiceDefinition(String serviceId, MessageContext messageContext) throws APIManagementException;
      public Response importService(String serviceId, String ifMatch, Boolean overwrite, MessageContext messageContext) throws APIManagementException;
      public Response searchServices(String name, String version, String definitionType, String displayName, String sortBy, String sortOrder, Integer limit, Integer offset, MessageContext messageContext) throws APIManagementException;
      public Response updateService(String serviceId, ServiceDTO catalogEntry, InputStream definitionFileInputStream, Attachment definitionFileDetail, MessageContext messageContext) throws APIManagementException;
}
