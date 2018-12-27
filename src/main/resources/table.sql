
INSERT INTO `guardian` (`guardian_id`, `address`, `name`, `nic`, `telephone`) VALUES ('1', 'ranjurawa, \r\nginigathhena', 'Ajith priyantha', '123456789v', '0714562358'), ('2', 'bagathuluwa,\r\nNawalapitiya', 'pathmawathi senehelatha', '9645821542v', '07724581245');

INSERT INTO `parent` (`parent_id`, `crs`, `nnt`, `contactno`, `fathername`, `fathernic`, `mothermaidenname`, `multiplebirth`, `nic`, `registration_no`) VALUES ('1', 'yes', 'no', '0117541128', 'saman', '124577833v', 'sumana', b'00', '12458786v', '111A');
INSERT INTO `parent` (`parent_id`, `crs`, `nnt`, `contactno`, `fathername`, `fathernic`, `mothermaidenname`, `multiplebirth`, `nic`, `registration_no`) VALUES (NULL, 'no', 'yes', '071452853', '', '092457812v', 'priyanthika', b'0', '91457822v', '12345we');

INSERT INTO `child` (`child_id`, `birth_weight`, `date_of_birth`, `full_name`, `gender`, `hin`, `place_of_birth`, `registration_date`, `registration_id`, `time_of_birth`, `area_id`, `address_id`, `guardian_id`, `hospital_id`, `parent_id`) VALUES (NULL, '2.34', '2018-12-12', 'sadaru', 'male', '11111111', 'laxapana', '2018-12-13', '12345e', '11:17:29', NULL, NULL, '2', NULL, '1');
INSERT INTO `ds` (`ds_id`, `name`, `rdhs_id`) VALUES (NULL, 'maskeliya', '1'), (NULL, 'kandy', '2'),(NULL, 'Gampola', '2'),(NULL, 'Ambagamuwa', '1'), (NULL, 'Hatton', '1'), (NULL, 'Thalawakele', '1'), (NULL, 'Norwood', '1');

INSERT INTO `rdhs` (`rdhs_id`, `name`) VALUES (NULL, 'Ampara'), (NULL, 'Anuradhapura'), (NULL, 'badulla'), (NULL, 'Batticlo'), (NULL, 'colombo'), (NULL, 'galle'), (NULL, 'gampaha'), (NULL, 'hambanthota'), (NULL, 'jaffna'), (NULL, 'kaluthara'), (NULL, 'kandy'), (NULL, 'kegalle'), (NULL, 'kilinochchi'), (NULL, 'kurunegala'), (NULL, 'mannarama'), (NULL, 'matale'), (NULL, 'mathara'), (NULL, 'monaragala'), (NULL, 'mullathivu'), (NULL, 'nuwara-eliya'), (NULL, 'polonnaruwa'), (NULL, 'puttalama'), (NULL, 'rathnapura'), (NULL, 'thrincomalee'), (NULL, 'vauniya');

INSERT INTO `ds` (`ds_id`, `name`, `rdhs_id`) VALUES (NULL, 'dimbulagala', '21'), (NULL, 'elahera', '21'), (NULL, 'hingurakgoda', '21'), (NULL, 'lankapura', '21'), (NULL, 'medirigriya', '21'), (NULL, 'thamankaduwa', '21'), (NULL, 'welikanda', '21');

INSERT INTO `ds` (`ds_id`, `name`, `rdhs_id`) VALUES (NULL, 'vauniya', '25'), (NULL, 'vauniya-north', '25'), (NULL, 'vauniya-south', '25'), (NULL, 'vengalacheddikulam', '25');

INSERT INTO `user` (`id`, `contactno`, `email`, `first_name`, `lastname`, `password`, `username`, `role_id`) VALUES (NULL, '071583564', 'nimaljayathisse12@gmail.com', 'nimal', 'jayathisse', '12345abc', 'nimal12@', '2'), (NULL, '0774521345', 'menakaperies@gmail.com', 'menaka', 'peries', '123m', 'abcd', '4');

INSERT INTO `role` (`role_id`, `privilege`, `role`) VALUES ('1', 'interface_01', 'admin'), ('2', 'interface_02', 'data_entry_operator'), ('3', 'interface_03', 'doctor'), ('4', 'interface_04', 'midwife');