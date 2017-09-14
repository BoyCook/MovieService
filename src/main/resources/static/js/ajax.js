
function ajax(params) {
    var xhr = new XMLHttpRequest();
    xhr.open(params.method ? params.method : 'GET', params.url, true);
    xhr.onreadystatechange = params.callBack;
    xhr.setRequestHeader("Content-Type", params.contentType ? params.contentType : "application/json;charset=UTF-8");

    if (params.data) {
        xhr.send(JSON.stringify(params.data));
    } else {
        xhr.send();
    }
}
