SELECT
    venda_id,
    data_venda
FROM dataqa.renner.bronze_vendas
WHERE data_venda < '2026-09-01'
   OR data_venda > '2026-09-13'
   OR data_venda IS NULL;