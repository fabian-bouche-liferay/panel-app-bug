package com.liferay.samples.fbo.panel.app.application.list;

import com.liferay.samples.fbo.panel.app.constants.MyPanelAppPanelCategoryKeys;
import com.liferay.samples.fbo.panel.app.constants.MyPanelAppPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Fabian-Liferay
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + MyPanelAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class MyPanelAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return MyPanelAppPortletKeys.MYPANELAPP;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + MyPanelAppPortletKeys.MYPANELAPP + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}