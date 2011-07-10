CREATE TABLE sale (
	month	varchar(3)				NOT NULL default '',
	date	date					NOT NULL default '0000-00-00',
	total	double					NOT NULL default '0',
	seq		int(10)		unsigned	NOT NULL default '0',

	PRIMARY KEY (month)
)