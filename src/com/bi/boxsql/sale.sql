CREATE TABLE sale (
	month	varchar(3)				NOT NULL default '',
	total	double					NOT NULL default '0',
	seq		int(10)		unsigned	NOT NULL default '0',

	PRIMARY KEY (month)
)