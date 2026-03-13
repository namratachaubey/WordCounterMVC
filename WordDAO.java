package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Word;
import util.DBConnection;

public class WordDAO {

public void save(Word w){

try{

Connection con=DBConnection.getConnection();

String sql="insert into worddata(textdata,words,characters,sentences) values(?,?,?,?)";

PreparedStatement ps=con.prepareStatement(sql);

ps.setString(1,w.getText());
ps.setInt(2,w.getWords());
ps.setInt(3,w.getCharacters());
ps.setInt(4,w.getSentences());

ps.executeUpdate();

}catch(Exception e){
e.printStackTrace();
}
}
}