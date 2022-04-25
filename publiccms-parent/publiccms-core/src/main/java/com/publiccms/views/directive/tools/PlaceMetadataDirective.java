package com.publiccms.views.directive.tools;

import java.io.IOException;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.common.constants.CommonConstants;
import com.publiccms.common.handler.RenderHandler;
import com.publiccms.common.tools.CommonUtils;
import com.publiccms.logic.component.template.MetadataComponent;
import com.publiccms.logic.component.template.TemplateComponent;
import com.publiccms.views.pojo.entities.CmsPageData;
import com.publiccms.views.pojo.entities.CmsPlaceMetadata;

/**
 *
 * PlaceMetadataDirective
 * 
 */
@Component
public class PlaceMetadataDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        String path = handler.getString("path");
        if (CommonUtils.notEmpty(path) && !path.endsWith(CommonConstants.SEPARATOR)) {
            String filePath = siteComponent.getWebTemplateFilePath(getSite(handler), TemplateComponent.INCLUDE_DIRECTORY + path);
            CmsPlaceMetadata metadata = metadataComponent.getPlaceMetadata(filePath);
            CmsPageData data = metadataComponent.getTemplateData(filePath);
            handler.put("object", metadata.getAsMap(data)).render();
        }
    }

    @Override
    public boolean needAppToken() {
        return true;
    }

    @Resource
    private MetadataComponent metadataComponent;
}
