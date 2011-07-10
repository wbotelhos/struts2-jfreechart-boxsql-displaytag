CREATE TABLE purchase (
	number	int(10)		unsigned	NOT NULL auto_increment,
	date	datetime				NOT NULL default '0000-00-00 00:00:00',
	item	varchar(45)				NOT NULL default '',
	total	double					NOT NULL default '0',

	PRIMARY KEY (number)
)