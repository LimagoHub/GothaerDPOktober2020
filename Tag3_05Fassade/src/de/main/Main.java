package de.main;

import de.table.Table;

public class Main {

	public static void main(final String[] args) {

		try (Table table = new Table("select * from tbl_personen")) {
			
			for (int column = 0; column < table.getColumnCount(); column++) {
				System.out.printf("%-20s", table.getColumnName(column));
			}
			System.out.println();

			while (table.next()) {
				for (int column = 0; column < table.getColumnCount(); column++) {
					System.out.printf("%-20s", table.getValue(column));
				}
				System.out.println();
			}

		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
