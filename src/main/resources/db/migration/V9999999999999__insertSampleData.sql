insert into category(name) values ('Nature');
insert into category(name) values ('Urban');

insert into photo(category_id, shutter_speed, aperture, iso, latitude, longitude, url)
  values ((select id from category where name = 'Nature'), '1/400', 'f/10.0', '200', '54 59 22.8', '-1 54 51', 'https://s3.us-east-2.amazonaws.com/rivard-photography/example-1.jpg');