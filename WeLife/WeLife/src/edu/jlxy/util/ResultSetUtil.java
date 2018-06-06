package edu.jlxy.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetUtil {

	public static final ResultSetUtil showResultSet = new ResultSetUtil();

	// 将结果集按要求输出到标准输出
	public void showResultSet(ResultSet resultSet, int index) {
		int col;
		try {
			if (resultSet != null) {
				col = resultSet.getMetaData().getColumnCount();
				if (index <= col) {
					for (int i = index; i <= col; i++) {

						System.out.print(resultSet.getMetaData().getColumnName(i) + "  ");

					}

					System.out.println();
					while (resultSet.next()) {
						for (int i = index; i <= col; i++) {

							System.out.print(resultSet.getString(i) + "  ");

						}
						System.out.println();
					}
				} else {
					System.out.println("=====索引输入错误=====");
					return;
				}
			} else {
				System.out.println("=====结果集为空=====");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	// 获取结果集中的行数
	private int getNumRows(ResultSet rs) throws Exception {
		int row = 0;
		if (rs.last()) {
			row = rs.getRow();
			rs.beforeFirst();// 将结果集中的光标重新移动到起始位置
		}
		return row;
	}
	// 获取结果集中的内容，将其存储到一个二维数组中
	public String[][] getResultSet(ResultSet resultSet, int index) throws Exception {
		int col, row, j = 0;
		try {
			if (resultSet != null) {
				col = resultSet.getMetaData().getColumnCount();
				row = getNumRows(resultSet);
				System.out.println("col=" + col + "row=" + row);
				String[][] result = new String[row][col];
				boolean bool;
				if (index <= col) {
					while (bool = resultSet.next()) {
						System.out.println(bool);
						System.out.println("===========数据===========");
						for (int i = index - 1; i < col; i++) {
							result[j][i] = resultSet.getString(i + 1);
						}
						if (j < row) {
							j++;
						}
					}
					return result;
				} else {
					System.out.println("=====索引输入错误=====");
					return null;
				}
				// for (int m = 0; m < row; m++) {
				// for (int n = 0; n < col; n++) {
				// System.out.println("==========");
				// System.out.println(result[m][n]);
				//
				// }
				// }
			} else {
				System.out.println("=====结果集为空=====");
				return null;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}
	//获取ResultSetUtil对象示例，调用该方法可以保证运行期间只创建一个ResultSetUtil对象
	public static ResultSetUtil getInstance() {
		return showResultSet;
	}
//检测data值与结果集中的值是否有重复
	public boolean isRepat(String data, ResultSet resultSet) {

		int col;
		try {
			//将结果集的光标重新移动到起始位置
			resultSet.beforeFirst();
			if (resultSet != null) {
				col = resultSet.getMetaData().getColumnCount();
				while (resultSet.next()) {
					for (int i = 1; i <= col; i++) {

						// System.out.print(resultSet.getString(i) + " ");
						// 数据库中取出的string无法与java中的匹配

						if (data.equals(resultSet.getString(i)))
							return true;
					}

				}

			} 
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

}
