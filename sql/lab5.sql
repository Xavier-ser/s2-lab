DELIMITER //

create trigger updateqty
after insert on saleitem
for each row
begin 
	update product set qty = qty-new.qty
    where pdtid = new.pdtid;
END //
delimiter ;

INSERT INTO Product VALUES (2, 'book', 10.00, 200);

INSERT INTO Sale VALUES (2, 'Address');

-- Step 3: Insert sale item (THIS triggers update)
INSERT INTO SaleItem VALUES (2, 2, 30);

SELECT * FROM Product;