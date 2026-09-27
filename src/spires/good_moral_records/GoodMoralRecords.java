package spires.good_moral_records;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import spires.util.MyConnection;

public class GoodMoralRecords {
    private GoodMoralRecords() {
    }

    public static void add(GoodMoralRecord record) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = MyConnection.connect();
            statement = connection.prepareStatement(
                    "insert into good_moral_records "
                    + "(protocol_no,person_name,residence,sex,purpose,issued_on,"
                    + "signing_priest,priest_designation,remarks,created_by,created_at,updated_at) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?)");
            bind(statement, record, false);
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            close(statement);
            MyConnection.close();
        }
    }

    public static void update(GoodMoralRecord record) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = MyConnection.connect();
            statement = connection.prepareStatement(
                    "update good_moral_records set protocol_no=?,person_name=?,residence=?,"
                    + "sex=?,purpose=?,issued_on=?,signing_priest=?,priest_designation=?,"
                    + "remarks=?,created_by=?,updated_at=? where id=?");
            bind(statement, record, true);
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            close(statement);
            MyConnection.close();
        }
    }

    private static void bind(PreparedStatement statement, GoodMoralRecord record,
            boolean update) throws SQLException {
        statement.setString(1, record.protocolNo);
        statement.setString(2, record.personName);
        statement.setString(3, record.residence);
        statement.setString(4, record.sex);
        statement.setString(5, record.purpose);
        statement.setDate(6, new java.sql.Date(record.issuedOn.getTime()));
        statement.setString(7, record.signingPriest);
        statement.setString(8, record.priestDesignation);
        statement.setString(9, record.remarks);
        statement.setString(10, record.createdBy);
        Timestamp now = new Timestamp(new Date().getTime());
        if (update) {
            statement.setTimestamp(11, now);
            statement.setLong(12, record.id);
        } else {
            statement.setTimestamp(11, now);
            statement.setTimestamp(12, now);
        }
    }

    public static void delete(long id) {
        PreparedStatement statement = null;
        try {
            Connection connection = MyConnection.connect();
            statement = connection.prepareStatement(
                    "delete from good_moral_records where id=?");
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            close(statement);
            MyConnection.close();
        }
    }

    public static List<GoodMoralRecord> search(String text, boolean protocol) {
        List<GoodMoralRecord> records = new ArrayList<GoodMoralRecord>();
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            Connection connection = MyConnection.connect();
            String column = protocol ? "protocol_no" : "person_name";
            statement = connection.prepareStatement(
                    "select id,protocol_no,person_name,residence,sex,purpose,issued_on,"
                    + "signing_priest,priest_designation,remarks,created_by "
                    + "from good_moral_records where " + column
                    + " like ? order by issued_on desc,id desc");
            statement.setString(1, "%" + text + "%");
            result = statement.executeQuery();
            while (result.next()) {
                records.add(new GoodMoralRecord(result.getLong(1), result.getString(2),
                        result.getString(3), result.getString(4), result.getString(5),
                        result.getString(6), result.getDate(7), result.getString(8),
                        result.getString(9), result.getString(10), result.getString(11)));
            }
            return records;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            close(result);
            close(statement);
            MyConnection.close();
        }
    }

    private static void close(PreparedStatement resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (SQLException ignored) {
            }
        }
    }

    private static void close(ResultSet resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (SQLException ignored) {
            }
        }
    }
}
