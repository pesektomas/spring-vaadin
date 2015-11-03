package org.tom.springVaadin.vaadin;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@Theme("valo")
@Title("VaadinSpring example")
public class Dashboard extends UI {

	private static final long serialVersionUID = 8046689069394890452L;

	@Override
	protected void init(VaadinRequest request) {
		
		Responsive.makeResponsive(this);
		addStyleName(ValoTheme.UI_WITH_MENU);
		
		HorizontalLayout horLayout = new HorizontalLayout();
		setContent(horLayout);
		horLayout.setSizeFull();

		horLayout.addComponent(new Label("TEST VAADIN"));
	}
}