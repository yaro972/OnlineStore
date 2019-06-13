$(document).ready(function () {
    $('input').last().on('click', function () {
        if ($("input[name=format]").prop("checked") === true) {
            $("form").submit();
        } else {
            $.ajax({
                url: "somme",
                data: $("form").serialize(),
                success: function (result) {
                    var message = "<p>La somme des 2 nombres fournis est " + result.somme.numerique + "</p>";
                    message = message.concat("<p>Le produit des 2 nombres fournis est " + result.produit.numerique + "</p>");
                    $("p").remove();
                    // $("form").after(result);
                    $("form").after(message);
                }
            });
        }
    });
});