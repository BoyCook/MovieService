ajax({
    url: '/movies',
    callBack: function() {
        if (this.readyState == 4) {
            var movies = JSON.parse(this.responseText);
            var html = '<table>';
            html += '<thead><tr><td>Name</td><td>Description</td></tr></thead>';
            for (var i=0, len=movies.length; i < len; i++) {
                html += '<tr><td>' + movies[i].name + '</td><td>' + movies[i].description + '</td></tr>';
            }

            html += '</table>';
            document.getElementById('movies').innerHTML = html;
        }
    }
});
