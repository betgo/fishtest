$(function () {
    $("#startToDiagnosis").click(function () {
        //loading层
        layer.msg('加载中', {
            icon: 16
            ,shade: 0.01
        });
        var season = $("#s1_seanson_show").text();
        var tem = $("#s1_tem_show").text();
        var fish = $("#s1 > div > div.myBox1 > div.myTab.myTab1 > div.myCon > div.workBox > div.workSelect > input").val();
        window.location.href = "./index_2.html?season="+season+"&tem="+tem+"&fish="+fish;
    })
})