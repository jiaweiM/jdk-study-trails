package tutorial.concurrency.jcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 24 Oct 2019, 9:25 AM
 */
public class RecordQuery
{
    private final Connection connection;

    public RecordQuery(Connection connection)
    {
        this.connection = connection;
    }

    public <T> T query(RowHandler<T> handler, String sql, Object... params) throws SQLException
    {
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            int index = 1;
            for (Object param : params) {
                stmt.setObject(index++, param);
            }
            ResultSet resultSet = stmt.executeQuery();
            return handler.handle(resultSet);
        }
    }
}
