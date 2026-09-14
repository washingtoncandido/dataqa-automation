SELECT
    venda_id,
    status
FROM dataqa.renner.silver_vendas
WHERE status IS NULL
   OR status NOT IN ('FATURADO', 'CANCELADO');