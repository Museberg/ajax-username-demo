function preventFormFromSending(searchform){
    searchform.submit(function (event){
        event.preventDefault(); // forhindrer at formen bliver sendt.
        addUser($("#name").val());// hent value fra <input...>
    });
}

function addUser(name){ // AJAX request
    console.log("AddUser er kaldet med " + name);
    var addObject = {};
    addObject["name"] = name;
    $.ajax({
            url:"/api/add",
            type:"POST",
            contentType:"application/JSON",
            data: JSON.stringify(addObject),
            success:function (data){
                console.log("SUCCESS svar fra server");
                $("#userList").prepend("<tr> <td>" + data.name + "</td></tr>");
            },
            error:function (data){
                console.log("ERROR i svar fra server");
                $("#userTD").html("ERROR i svar fra server");
            }
        });
}

function checkjQuery(){
    if(typeof jQuery != undefined){
        console.log("jQuery er loaded")
    }else {
        console.log("jQuery er IKKE loaded")
    }
}