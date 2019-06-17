$(document).ready(function () {
    $('input').last().on('click', function () {
        if ($("input[name=format]").prop("checked") === true) {
            $("form").submit();
        } else {
            $.ajax({
                url: "rest/calculation/somme-et-produit",
                data: $("form").serialize(),
                success: function (result) {
                    var message = "<p>La somme des 2 nombres fournis est <strong>" + result.somme.numerique + "-" + result.somme.texte + "</strong> </p>";
                    message = message.concat("<p>Le produit des 2 nombres fournis est <strong> " + result.produit.numerique + "-" + result.produit.texte + "</strong> </p>");
                    $("p").remove();
                    // $("form").after(result);
                    $("form").after(message);
                }
            });
        }
    });
});