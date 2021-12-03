package by.bsuir.webTech3.server.service;

import by.bsuir.webTech3.server.service.impl.ServerServiceImpl;

public final class ServiceFactory {

	private static final ServiceFactory instance = new ServiceFactory();

	private final ServerService applianceService = new ServerServiceImpl();

	private ServiceFactory() {}

	public ServerService getApplianceService() {

		return applianceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
