package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.WordDAO;
import model.Word;

@WebServlet("/count")

public class WordCounterServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException,IOException{

String text=request.getParameter("text");

int words=text.trim().split("\\s+").length;
int characters=text.length();
int sentences=text.split("[.!?]").length;

Word w=new Word();

w.setText(text);
w.setWords(words);
w.setCharacters(characters);
w.setSentences(sentences);

WordDAO dao=new WordDAO();
dao.save(w);

request.setAttribute("words",words);
request.setAttribute("characters",characters);
request.setAttribute("sentences",sentences);

request.getRequestDispatcher("result.jsp").forward(request,response);

}
}