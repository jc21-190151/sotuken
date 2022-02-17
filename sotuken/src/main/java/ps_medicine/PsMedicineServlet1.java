package ps_medicine;



import java.io.IOException;
import java.io.InputStream;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



import been.ImageBean;
import dao.DAO;

import psMeal.psMealServlet2;



/**
* Servlet implementation class psMedicineServlet1
*/
@WebServlet("/ps_medicine/PsMedicineServlet1")
public class PsMedicineServlet1 extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public PsMedicineServlet1() {
super();
// TODO Auto-generated constructor stub
}



/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
}



/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//multipart/form-dataで送信されたデータを取得
Part part = request.getPart("image2");
InputStream inputStream = part.getInputStream();

//InputStreamをByte配列に変換してDBに保存
byte[] bt = psMealServlet2.convertInputStreamToArray(inputStream);
ImageBean imageBean = new ImageBean();
imageBean.setImage(bt);

DAO dao = new DAO();
try {
dao.uploadImage(imageBean);
} catch (Exception e) {
e.printStackTrace();
}

request.getRequestDispatcher("/WEB-INF/ps_complete.jsp").forward(request, response);
}



}
