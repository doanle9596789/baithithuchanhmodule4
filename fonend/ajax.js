function getAll(){
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        url:"http://localhost:8080/city/findAll",
        type:"GET",
        success:function (data) {
            console.log(data)
            let content="";
            for (let  i= 0;  i< data.length; i++) {
                content+=` <th>${data[i].name}</th>
        <th>${data[i].nation}</th>
        <th>${data[i].acreage}</th>d
        <th>${data[i].population }</th>
        <th>${data[i].jdp }</th>
        <th>${data[i].description }</th>
        <th>Thao tác</th>
        <td>
            <button onclick="editForm(${data.id})">Sửa</button>
        </td>
        <td>
            <button onclick="deleteFormCity(${data.id})">Xoa</button>
        </td>`
            }
            document.getElementById("content1").innerHTML=content;
        }
    })


}
getAll();
function create() {
    event.preventDefault();
    let name = $("#name").val();
    let country = $("#country").val();
    let area = $("#area").val();
    let population = $("#population").val();
    let gdp = $("#gdp").val();
    let description = $("#description").val();
    let newCity = {
        "name": name,
        "country": country,
        "area": area,
        "population": population,
        "gdp": gdp,
        "description": description
    }
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        url: "http://localhost:8080/city/createCity",
        data: JSON.stringify(newCity),
        success: getAll(),

    })
}
function deleteFormCity(id){
    $.ajax({
        url:"http://localhost:8080/findById"+id,
        type:"GET",
        success:function (date) {
            var queryString = $.param(date);
            window.location.href = "../fonend/delete.html"+queryString;
        }
    })
}
function deleteCity(id){
    event.defaultPrevented;

    $.ajax({
        url:"http://localhost:8080/city/deleteCity/"+id,
        type:"GET",
        success:function (date) {
            alert("xóa thành công")
            getAll();
        }
    })

}
function editForm(id){
    $.ajax({
        url:"http://localhost:8080/findById"+id,
        type:"GET",
        success:function (date) {
            var queryString = $.param(date);
            window.location.href = "../fonend/edit.html"+queryString;
        }
    })
}
function edit() {
    event.preventDefault();
    let id = $("#id").val();
    let name = $("#name-edit").val();
    let country = $("#country-edit").val();
    let area = $("#area-edit").val();
    let population = $("#population-edit").val();
    let gdp = $("#gdp-edit").val();
    let description = $("#description-edit").val();
    let newCity = {
        "name": name,
        "country": country,
        "area": area,
        "population": population,
        "gdp": gdp,
        "description": description
    }
    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/city/findById" + id,
        dataType: "json",
        data: JSON.stringify(newCity),
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        success: getAll()

    });
}
