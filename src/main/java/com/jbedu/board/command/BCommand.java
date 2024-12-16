package com.jbedu.board.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface BCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
