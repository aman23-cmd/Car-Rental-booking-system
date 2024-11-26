// Wait until the DOM is fully loaded
document.addEventListener("DOMContentLoaded", () => {
    // Get elements
    const loginBtn = document.querySelector(".login");
    const signUpBtn = document.querySelector("input[value='Sign Up']");
    const modal = document.querySelector(".modal");
    const closeModalBtn = document.querySelector(".close-modal");
    const overlay = document.querySelector(".overlay");
  
    // Open modal
    const openModal = () => {
      modal.classList.add("active");
      overlay.classList.add("active");
    };
  
    // Close modal
    const closeModal = () => {
      modal.classList.remove("active");
      overlay.classList.remove("active");
    };
  
    // Event listeners for buttons
    loginBtn.addEventListener("click", openModal);
    signUpBtn.addEventListener("click", openModal);
    closeModalBtn.addEventListener("click", closeModal);
    overlay.addEventListener("click", closeModal);
  
    // Log form data for testing
    document.querySelector(".modal-form").addEventListener("submit", (e) => {
      e.preventDefault(); // Prevent page reload
      const email = document.querySelector("#email").value;
      const password = document.querySelector("#password").value;
      console.log("Email:", email);
      console.log("Password:", password);
      closeModal(); // Close the modal
    });
  });
  
