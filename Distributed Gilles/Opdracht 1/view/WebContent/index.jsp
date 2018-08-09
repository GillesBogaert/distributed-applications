<!DOCTYPE html>
<html lang="en"><head>
<title>Composite Test</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.min.js" /> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">

	<h1>Check console log for data</h1>

	
	<script>
	
	
	$(document).ready(function(){
		f1();
		f2("The grudge");
	});
	
	
		function f1(){
			$.get("http://localhost:8765/movie/recommendations", function(data){
				console.log(data);
			});
		};
		
		function f2(movie){
			$.get("http://localhost:8765/movie/movie/"+movie, function(data){
				console.log(data);
			});
		}	
	</script>	
	
	</div>
</body></html>