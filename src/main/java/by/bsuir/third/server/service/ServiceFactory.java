package by.bsuir.third.server.service;

import by.bsuir.third.server.service.impl.ServerServiceImpl;

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
