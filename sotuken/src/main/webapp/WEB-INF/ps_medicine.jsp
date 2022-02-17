<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>撮影画面（薬の容器）</title>
<link rel="stylesheet"
href="<%=request.getContextPath()%>/css/ps_medicine.css">
</head>
<body>



<header>
<h3>これから飲む薬です！</h3>
<p>下の画像の薬が今回飲む薬です。</p>
</header>



<div class="contents">
<img src="" alt="これから飲む薬の画像">
<h2>飲んだ薬を撮影しましょう！</h2>
<p>
上の画像の薬を飲んだら飲んだ証拠として薬の空の容器などを撮影しましょう。<br> 撮影したら撮った写真を送信しましょう。<br>
下の撮影ボタンで撮影、送信ボタンで送信できます。
</p>
<button type="button">撮影する</button>
<form action="/ps_medicine/psMedicineServlet1" method="post"
enctype="multipart/form-data">
<input type="file" name="image2" accept="image/*">
<button type="submit">送信する</button>
</form>
</div>



</body>
</html>