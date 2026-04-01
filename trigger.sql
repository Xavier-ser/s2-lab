DELIMITER //

CREATE TRIGGER updateAvailableQuantity
AFTER INSERT ON SaleItem
FOR EACH ROW
BEGIN
    UPDATE Product
    SET QtyInStock = QtyInStock - NEW.Qty
    WHERE PdtId = NEW.PdtId;
END //

DELIMITER ;