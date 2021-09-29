package DB;

import java.sql.*;

public class SQL {

    private static final String url = "";
    private static final String username = "postgres";
    private static final String password = "error2002";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static Statement getStatement() {
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return statement;
    }

//    public void save() {
//
//        Statement statement = SQL.getStatement();
//        User user = new User();
//
////        PreparedStatement preparedStatement = null;
////        try {
////            preparedStatement = SQL.getConnection().prepareStatement("select max(id) as max from user");
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        }
////
////        ResultSet resultSet = null;
////        try {
////            assert preparedStatement != null;
////            resultSet = preparedStatement.executeQuery();
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////        }
////
////        Integer id = null;
////        if (resultSet != null) {
////            try {
////                if (resultSet.next()) {
////                    id = resultSet.getInt("max");
////                }
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////            }
////        }
////
////        if (id == null)
////            user.setId(1);
////        else user.setId(id + 1);
//
//        user = new User();
//        String sql = String.format("insert into user (id, username, fin, password) values (%s, '%s', '%s','%s' )",
//                user.getId(),
//                user.getUsername(),
//                user.getFin(),
//                user.getPassword());
//        try {
//            statement.execute(sql);
//            System.out.println("Successfully registered");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
}
