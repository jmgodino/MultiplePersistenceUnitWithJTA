<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils,org.springframework.context.ApplicationContext,com.jccm.edu.wsc.valida.data.CombinaDao" %>

<%

	ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession(true).getServletContext());
	CombinaDao combinaDao = ctx.getBean("combinaDao",CombinaDao.class);
	
	out.println("Ejecutando Test Revisado ...");
	combinaDao.distribuida();

%>