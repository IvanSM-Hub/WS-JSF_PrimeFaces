package com.jsfstarterproject.internationalization;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@Named
@ViewScoped
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private DashboardModel model;
	
	public MenuBean() {
        
		model = new DefaultDashboardModel();
        
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        
        column1.addWidget("sports");
        column1.addWidget("viewreserves");
        column2.addWidget("lifestyle");
        column2.addWidget("stadistics");
        column3.addWidget("direct");
        
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        
    }

	public DashboardModel getModel() {
		return model;
	}
	
}
