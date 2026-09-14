SELECT
    venda_id,
    quantidade
FROM dataqa.renner.bronze_vendas
WHERE quantidade <= 0
   OR quantidade IS NULL;