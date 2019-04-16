insert into Ground_Company values ('1111 S Ground St.', 'GroundCompany1', '11');
insert into Ground_Company values ('1112 S Ground St.', 'GroundCompany2', '12');
insert into Ground_Company values ('1113 S Ground St.', 'GroundCompany3', '13');
insert into Ground_Company values ('1114 S Ground St.', 'GroundCompany4', '14');
insert into Ground_Company values ('1115 S Ground St.', 'GroundCompany5', '15');

insert into Air_Company values ('1111 S Air St.', 'AirCompany1', '11');
insert into Air_Company values ('1112 S Air St.', 'AirCompany2', '12');
insert into Air_Company values ('1113 S Air St.', 'AirCompany3', '13');
insert into Air_Company values ('1114 S Air St.', 'AirCompany4', '14');
insert into Air_Company values ('1115 S Air St.', 'AirCompany5', '15');

insert into Water_Company values ('1111 S Water St.', 'WaterCompany1', '11');
insert into Water_Company values ('1112 S Water St.', 'WaterCompany2', '12');
insert into Water_Company values ('1113 S Water St.', 'WaterCompany3', '13');
insert into Water_Company values ('1114 S Water St.', 'WaterCompany4', '14');
insert into Water_Company values ('1115 S Water St.', 'WaterCompany5', '15');

insert into Water_Transportation value ('SeaDoo', 'Spark1', 100);
insert into Water_Transportation value ('SeaDoo', 'Spark2', 200);
insert into Water_Transportation value ('SeaDoo', 'Spark3', 300);
insert into Water_Transportation value ('SeaDoo', 'Spark4', 400);
insert into Water_Transportation value ('SeaDoo', 'Spark5', 500);

insert into Air_Transportation value ('Boeing', '717', 100);
insert into Air_Transportation value ('Boeing', '727', 200);
insert into Air_Transportation value ('Boeing', '737', 100);
insert into Air_Transportation value ('Boeing', '747', 100);
insert into Air_Transportation value ('Boeing', '757', 50);

insert into Ground_Transportation value ('Nissan', '370Z', 2);
insert into Ground_Transportation value ('Honda', 'Civic', 5);
insert into Ground_Transportation value ('Dodge', 'Avenger', 5);
insert into Ground_Transportation value ('Ford', 'Mustang', 5);
insert into Ground_Transportation value ('Nissan', 'Xterra', 5);

insert into Transportation_purpose value ('Ride Share', 'SeaDoo', 'Spark1');
insert into Transportation_purpose value ('Combat', 'SeaDoo', 'Spark2');
insert into Transportation_purpose value ('Surveying', 'SeaDoo', 'Spark3');
insert into Transportation_purpose value ('Ride Share', 'SeaDoo', 'Spark4');
insert into Transportation_purpose value ('Trading', 'SeaDoo', 'Spark5');

Insert into Licensed_Driver value ('bb124', '222-22-2222', '01-11-1980', 'Mike', 'Hong','F');
Insert into Licensed_Driver value ('bb121', '111-11-1111', '04-21-1980', 'Sam', 'Tan','F');
Insert into Licensed_Driver value ('bb131', '333-33-3333', '01-31-1980', 'Crew', 'Tiger','F');
Insert into Licensed_Driver value ('bb122', '444-44-4444', '02-01-1980', 'Abby', 'Fox','F');
Insert into Licensed_Driver value ('bb321', '555-55-5555', '02-03-1980', 'Bailey', 'Grant','F');

Insert into Licensed_Captain value ('aa123', '666-66-6666', '01-01-1980', 'Maxwell', 'Leung','F');
Insert into Licensed_Captain value ('aa121', '777-77-7777', '01-01-1980', 'Justin', 'Kong', 'M');
Insert into Licensed_Captain value ('aa133', '888-88-8888', '01-01-1980', 'Kevin', 'Kong', 'M');
Insert into Licensed_Captain value ('aa153', '999-99-9999', '01-01-1980', 'Kris', 'Cap', 'F');
Insert into Licensed_Captain value ('aa111', '242-23-5433', '01-01-1980', 'Haha', 'Baba', 'F');

Insert into Licensed_Pilot value ('ab123', '166-66-6666', '01-01-1980', 'Alex', 'Hong','F' );
Insert into Licensed_Pilot value ('ab123', '266-66-6666', '01-01-1980', 'Alec', 'Hong','F' );
Insert into Licensed_Pilot value ('ab123', '366-66-6666', '01-01-1980', 'Aleg', 'Hong','F' );
Insert into Licensed_Pilot value ('ab123', '466-66-6666', '01-01-1980', 'Aleb', 'Hong','F' );
Insert into Licensed_Pilot value ('ab123', '566-66-6666', '01-01-1980', 'Ales', 'Hong','F' );

Insert into Customer value ('cc123', '123-66-6666', '01-01-1980', 'John', 'Hong','M' );
Insert into Customer value ('cc124', '124-66-6666', '01-01-1980', 'Bohn', 'Hong','M' );
Insert into Customer value ('cc125', '125-66-6666', '01-01-1980', 'Cohn', 'Hong','F' );
Insert into Customer value ('cc126', '126-66-6666', '01-01-1980', 'Sohn', 'Hong','M' );
Insert into Customer value ('cc127', '127-66-6666', '01-01-1980', 'Dohn', 'Hong','F' );

Insert into Air_Hangar value('111 w airway', 'Jackson', 20);
Insert into Air_Hangar value('111 s airway', 'Berry', 30);
Insert into Air_Hangar value('111 n airway', 'Roger',20);
Insert into Air_Hangar value('111 e airway', 'Ray', 50);
Insert into Air_Hangar value('131 e airway', 'Kev', 50);

Insert into Parking_Garage value('111 w driveway', 'Joon', 50);
Insert into Parking_Garage value('111 s driveway', 'Nidd', 430);
Insert into Parking_Garage value('111 n driveway', 'Futonie', 220);
Insert into Parking_Garage value('111 e driveway', 'Frankie', 250);
Insert into Parking_Garage value('131 e driveway', 'ASC', 650);

Insert into Storage_Dock value('111 w Dockway', 'XCJ', 7);
Insert into Storage_Dock value('111 s Dockway', 'DKS', 6);
Insert into Storage_Dock value('111 n Dockway', 'Church', 2);
Insert into Storage_Dock value('111 e Dockway', 'KFC', 10);
Insert into Storage_Dock value('131 e Dockway', 'Popeye', 9);

Insert into Ground_Service value ('Honda', 'Civic', 'Broken', '12:30', 'Denver');
Insert into Ground_Service value ('Dodge', 'Avenger' 'Maintenance', '12:15', 'Denver');
Insert into Ground_Service value ('Ford', 'Mustang', 'Damage', '1:45', 'Denver');
Insert into Ground_Service value ('Honda', 'Civic', 'Replacement', '1:30', 'Denver');
Insert into Ground_Service value ('Honda', 'Civic', 'Checkup', '2:30', 'Denver');

Insert into Owns value ('Honda', 'Civic', '1111 S Ground St.');
Insert into Owns value ('Dodge', 'Avenger', '1112 S Ground St.');
Insert into Owns value ('Ford', 'Mustang', '1113 S Ground St.');
Insert into Owns value ('Honda', 'Civic', '1114 S Ground St.');
Insert into Owns value ('Honda', 'Civic', '1115 S Ground St.');

Insert into Service_Company value('Honda', 'Civic', 'Maintenance', 1, '1122 S Ground St.', 'GroundService1');
Insert into Service_Company value('Honda', 'Civic', 'Maintenance', 1, '1133 S Ground St.', 'GroundService2');
Insert into Service_Company value('Honda', 'Civic', 'Maintenance', 1, '1144 S Ground St.', 'GroundService3');
Insert into Service_Company value('Honda', 'Civic', 'Maintenance', 1, '1155 S Ground St.', 'GroundService4');
Insert into Service_Company value('Honda', 'Civic', 'Maintenance', 1, '1166 S Ground St.', 'GroundService5');

Insert into Rent value ('Honda', 'Civic', 'cc123');
Insert into Rent value ('Dodge', 'Avenger', 'cc124');
Insert into Rent value ('Dodge', 'Avenger', 'cc125');
Insert into Rent value ('Dodge', 'Avenger', 'cc126');
Insert into Rent value ('Dodge', 'Avenger', 'cc127');



