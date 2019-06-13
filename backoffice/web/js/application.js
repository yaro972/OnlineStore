$(document).ready(function () {
    $('a[href=catalogue]').on('click', function (event) {
        event.preventDefault();
        console.log($('body').children().length);

        if ($('h3').length < 1) {
            // if ($('body').children().length < 6) {
            $.ajax({
                url: "catalogue",
                success: function (result) {
                    $("a[href=catalogue]").after('<br>' + result);
                }
            });
        }
    });
});