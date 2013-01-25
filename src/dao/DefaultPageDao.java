package dao;

import java.util.List;
/**
 *
 * @author zhiweiv
 */
public interface DefaultPageDao {
    public List get(int start, int length);
    public int getCount();
}
