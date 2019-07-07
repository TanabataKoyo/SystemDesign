package users;

@WebServlet("/Delete")
public class Delete extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Delete() {
        super();
    }

//get
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws servlet ServletExcepction,IOException{
        request.setCharacterEncoding("UTF-8");

        //request.setAttribute("",);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/entry.jsp");
        dispatcher.forward(request, response);
    }
}
