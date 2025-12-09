document.addEventListener("DOMContentLoaded", function() {
    console.log("JavaScript Loaded!");

    // Show a confirmation before deleting a candidate
    const deleteLinks = document.querySelectorAll("a[href^='/delete_candidate/']");
    deleteLinks.forEach(link => {
        link.addEventListener("click", function(event) {
            if (!confirm("Are you sure you want to delete this candidate?")) {
                event.preventDefault();
            }
        });
    });

    // Form Validation
    const form = document.querySelector("form");
    if (form) {
        form.addEventListener("submit", function(event) {
            const inputs = form.querySelectorAll("input, select");
            for (let input of inputs) {
                if (input.value.trim() === "") {
                    alert("Please fill out all fields.");
                    event.preventDefault();
                    return;
                }
            }
        });
    }
});
