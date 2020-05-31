
function login(){
	console.log("我是login按钮");
	 var username=$("#username").val();
	 var password=$("#password").val();
	 console.log(username+password);
	 $.ajax({
		 url:"/findjob/login",
		 type:"post",
		 data:{
			 username:username,
			 password:password
		 },
		 success:function(data){
			console.log(data); 
		 }
		 
	 });
}
function  addUser(){
	window.open("/findjob/html/addUser.html");
}
//注册用户
function regester(){
	var username=$("#username").val();
	var usersex=$("#usersex").val();
	var userage=$("#userage").val();
	var useremail=$("#useremail").val();
	var workstatus=$("#workstatus").val();
	var password=$("#password").val();
	console.log(username+usersex+userage+useremail+workstatus+password);
}

function sendEmail(){
	 $.ajax({
		 url:"/findjob/sendEmail",
		 type:"post",
		 success:function(data){
			console.log(data); 
		 }
		 
	 });
}