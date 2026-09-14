SELECT
    venda_id,
    data_venda
FROM dataqa.renner.silver_vendas
WHERE data_venda IS NULL;