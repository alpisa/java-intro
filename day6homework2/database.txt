BEGIN;


CREATE TABLE public.Users
(
    id integer NOT NULL,
    email character varying NOT NULL,
    password character varying NOT NULL,
    create_date date NOT NULL,
    update_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.Jobseekers
(
    jobskeer_id integer,
    first_name character varying,
    last_name character varying,
    identity_id character varying,
    date_of_year integer,
    PRIMARY KEY (jobskeer_id)
);

CREATE TABLE public.Employee
(
    employee_id integer,
    first_name character varying,
    last_name character varying,
    PRIMARY KEY (employee_id)
);

CREATE TABLE public.Job_Positions
(
    id integer,
    name character varying,
    is_active boolean,
    PRIMARY KEY (id)
);

CREATE TABLE public.Employers
(
    employer_id integer,
    name character varying,
    web_site character varying,
    phone_number character varying,
    PRIMARY KEY (employer_id)
);

CREATE TABLE public.Validation_Jobskeers
(
    id integer NOT NULL,
    jobskeer_id integer NOT NULL,
    is_verified boolean NOT NULL,
    verify_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.Validation_Employers
(
    id integer NOT NULL,
    employer_id integer NOT NULL,
    employee_id integer NOT NULL,
    is_verified boolean NOT NULL,
    verification_date date NOT NULL,
    is_confirm boolean NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.Validation_Jobskeers
    ADD FOREIGN KEY (jobskeer_id)
    REFERENCES public.Jobseekers (jobskeer_id)
    NOT VALID;


ALTER TABLE public.Validation_Employers
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.Employers (employer_id)
    NOT VALID;


ALTER TABLE public.Validation_Employers
    ADD FOREIGN KEY (employee_id)
    REFERENCES public.Employees (employee_id)
    NOT VALID;


ALTER TABLE public.Jobseekers
    ADD FOREIGN KEY (jobskeer_id)
    REFERENCES public.Users (id)
    NOT VALID;


ALTER TABLE public.Employers
    ADD FOREIGN KEY (employer_id)
    REFERENCES public.Users (id)
    NOT VALID;


ALTER TABLE public.Employee
    ADD FOREIGN KEY (employee_id)
    REFERENCES public.Users (id)
    NOT VALID;

END;