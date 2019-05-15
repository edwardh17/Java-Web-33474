-- Table: public.login

-- DROP TABLE public.login;

CREATE TABLE public.login
(
  email character varying(48) NOT NULL,
  pw character varying(128) NOT NULL,
  first_name character varying(24) NOT NULL,
  last_name character varying(24) NOT NULL,
  mobile character varying(24) NOT NULL,
  dni integer NOT NULL,
  CONSTRAINT pk_login_email PRIMARY KEY (email),
  CONSTRAINT ux_login_dni UNIQUE (dni),
  CONSTRAINT ux_login_mobile UNIQUE (mobile)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.login
  OWNER TO postgres;
