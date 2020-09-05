DROP TABLE IF EXISTS ParkingLot;
 
CREATE TABLE ParkingLot (
  number VARCHAR(250) NOT NULL,
  time TIMESTAMP  NOT NULL,
  type VARCHAR(250) NOT NULL
);
 
INSERT INTO ParkingLot  VALUES
  ('KA03JI908', parsedatetime('01-10-2012 01:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Entry'),
  ('KA03JI908', parsedatetime('01-10-2012 03:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Exit'),
  ('KA03JI908', parsedatetime('01-10-2012 05:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Entry'),
  ('KA03JI908', parsedatetime('01-10-2012 07:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Exit'),
  ('KA02JK1029', parsedatetime('01-10-2012 08:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Entry'),
  ('KA02JK1029', parsedatetime('01-10-2012 11:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Exit'),
  ('KA05K987', parsedatetime('01-10-2012 15:00:00', 'dd-MM-yyyy hh:mm:ss'), 'Entry'),
  ('KA05K987', parsedatetime('01-10-2012 15:30:00', 'dd-MM-yyyy hh:mm:ss'), 'Exit');
  