SELECT
    venda_id,
    status
FROM dataqa.renner.bronze_vendas
WHERE status IS NULL
   OR status NOT IN ('FATURADO', 'CANCELADO');