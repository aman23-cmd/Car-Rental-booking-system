@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("username", "Aman");
    request.getRequestDispatcher("/profile.jsp").forward(request, response);
}
