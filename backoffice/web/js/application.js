$(document).ready(function () {
    $('a[href=catalogue]').on('click', function (event) {
        event.preventDefault();
        console.log($('body').children().length);

        if ($('h3').length < 1) {
            // if ($('body').children().length < 6) {
            $.ajax({
                url: "catalogue",
                success: function (result) {
                    var msg = "<h3>Oeuvres au catalogue</h3><ul>";

                    result.forEach(function (el) {

                        msg += "<li>" + el.title + "  (" + el.release + ")</li>";

                    });
                    $("a[href=catalogue]").after(msg);

                }
            });
        }
    });
});