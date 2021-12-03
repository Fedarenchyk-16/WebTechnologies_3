package by.bsuir.third.server.main;

import by.bsuir.third.server.service.ServerLogic;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerLogic serverLogic = new ServerLogic();
		serverLogic.startConnection();
	}
}

/*
CONNECT
Login:
EXAMPLE: LOGIN[NAME][PASSWORD]
LOGIN[Abobus][9090]
LOGIN Name: Abobus, allowance: ADD

EXAMPLE OF COMMANDS:
 GETALL
 EDIT[NAME][NEWNAME][NEWSCORE]
 LOGOUT
 GET[NAME]
 ADD[NAME][SCORE]
 REG[NAME][PASSWORD][ALLOWANCE]

 */